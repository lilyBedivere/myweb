    package org.andy.shop.model;  
    import java.util.List;  
      
    public class UserInfo {  
        private Integer id;  
      
        private String uname;  
      
        private Integer unumber;  
      
        private List<CourseInfo> courseInfos;  
      
        public Integer getId() {  
            return id;  
        }  
      
        public void setId(Integer id) {  
            this.id = id;  
        }  
      
        public String getUname() {  
            return uname;  
        }  
      
        public void setUname(String uname) {  
            this.uname = uname == null ? null : uname.trim();  
        }  
      
        public Integer getUnumber() {  
            return unumber;  
        }  
      
        public void setUnumber(Integer unumber) {  
            this.unumber = unumber;  
        }  
      
        public List<CourseInfo> getCourseInfos() {  
            return courseInfos;  
        }  
      
    }  