package cn.et.lesson03.food.entity;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sid
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sname
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.gid
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    private Integer gid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    private Integer sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.address
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sid
     *
     * @return the value of student.sid
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sid
     *
     * @param sid the value for student.sid
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sname
     *
     * @return the value of student.sname
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sname
     *
     * @param sname the value for student.sname
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.gid
     *
     * @return the value of student.gid
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.gid
     *
     * @param gid the value for student.gid
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.address
     *
     * @return the value of student.address
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.address
     *
     * @param address the value for student.address
     *
     * @mbg.generated Fri Dec 08 14:39:52 CST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}