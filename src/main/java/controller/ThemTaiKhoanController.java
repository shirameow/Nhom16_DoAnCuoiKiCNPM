package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import DAO.*;
/**
 * Servlet implementation class ThemTaiKhoanController
 */
@WebServlet("/them-tk")
public class ThemTaiKhoanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		/*
		 * String username=request.getParameter("username"); String
		 * password=request.getParameter("password"); String
		 * role=request.getParameter("role"); accountModel newacc=new
		 * accountModel(username,password,role); String messTTK=""; if(new
		 * AccountDAO().ThemTK(newacc)) { messTTK="Tạo tài khoản thành công!"; } else {
		 * messTTK="Tạo tài khoản thất bại!"; } request.setAttribute("messTTK",
		 * messTTK);
		 */
		request.getRequestDispatcher("themTK.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}