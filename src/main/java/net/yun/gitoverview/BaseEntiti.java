package net.yun.gitoverview;

import java.util.StringJoiner;

public class BaseEntiti {
    private Long iD;

    public Long getiD() {
        return iD;
    }

    public void setiD(Long iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BaseEntiti.class.getSimpleName() + "[", "]")
                .add("iD=" + iD)
                .toString();
    }

    public boolean isNew(){
        return (this.iD == null);

    }
}
