package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0018a {
    public static final AbstractC0018a ENV;
    private static volatile List<String> FeaturesList = new ArrayList();
    public static final String MF_JSON = "UNIFIED_SDK_JSON";
    public static final AbstractC0018a UNIVERSAL;
    private static final AbstractC0018a[] service;
    private int indexNum;
    private String nameString;

    static {
        AbstractC0018a abstractC0018a = new AbstractC0018a("ENV", 2) { // from class: com.tendcloud.tenddata.a.1
            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getCert() {
                return "";
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getDataFolder() {
                return super.getDataFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public int getFileLimitType() {
                return super.getFileLimitType();
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getHost() {
                return C0019aa.f81l;
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getIP() {
                return C0019aa.f83n;
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getMessageFormat() {
                return AbstractC0018a.MF_JSON;
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getRootFolder() {
                return super.getRootFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getUrl() {
                return "https://me.cpatrk.net";
            }
        };
        ENV = abstractC0018a;
        AbstractC0018a abstractC0018a2 = new AbstractC0018a("SDK", 99) { // from class: com.tendcloud.tenddata.a.2
            private boolean isUrlUpdated = false;
            private String url;

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getCert() {
                return "";
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getDataFolder() {
                return super.getDataFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public int getFileLimitType() {
                return super.getFileLimitType();
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getHost() {
                return C0019aa.f71b;
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getIP() {
                return C0019aa.f76g;
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getMessageFormat() {
                return AbstractC0018a.MF_JSON;
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getRootFolder() {
                return super.getRootFolder();
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public String getUrl() {
                return this.isUrlUpdated ? this.url : C0019aa.f80k;
            }

            @Override // com.tendcloud.tenddata.AbstractC0018a
            public void setUrl(String str) {
                this.isUrlUpdated = true;
                this.url = str;
            }
        };
        UNIVERSAL = abstractC0018a2;
        service = new AbstractC0018a[]{abstractC0018a, abstractC0018a2};
    }

    public AbstractC0018a(String str, int i) {
        this.nameString = str;
        this.indexNum = i;
        addFeatures2List(str);
    }

    public AbstractC0018a(String str, int i, boolean z) {
        this.nameString = str;
        this.indexNum = i;
    }

    private void addFeatures2List(String str) {
        try {
            if (C0131y.m767b(str) || FeaturesList.contains(str)) {
                return;
            }
            FeaturesList.add(str);
        } catch (Throwable unused) {
        }
    }

    public static ArrayList<AbstractC0018a> getFeaturesList() {
        ArrayList<AbstractC0018a> arrayList = new ArrayList<>();
        for (int i = 0; i < FeaturesList.size(); i++) {
            try {
                if (valueOf(FeaturesList.get(i)) != null) {
                    arrayList.add(valueOf(FeaturesList.get(i)));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static List<String> getFeaturesNameList() {
        return FeaturesList;
    }

    public static AbstractC0018a valueOf(String str) {
        AbstractC0018a abstractC0018a = ENV;
        if (str.equals(abstractC0018a.name())) {
            return abstractC0018a;
        }
        AbstractC0018a abstractC0018a2 = UNIVERSAL;
        if (str.equals(abstractC0018a2.name())) {
            return abstractC0018a2;
        }
        return null;
    }

    public static AbstractC0018a[] values() {
        AbstractC0018a[] abstractC0018aArr = service;
        return (AbstractC0018a[]) Arrays.copyOf(abstractC0018aArr, abstractC0018aArr.length);
    }

    public abstract String getCert();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getDataFolder() {
        StringBuilder sbM1039 = C0167c4.m1039("td_database");
        sbM1039.append(index());
        sbM1039.append(C0098cz.f435c);
        return sbM1039.toString();
    }

    public int getFileLimitType() {
        return 1;
    }

    public abstract String getHost();

    public abstract String getIP();

    public abstract String getMessageFormat();

    public String getRootFolder() {
        return C0019aa.f87r;
    }

    public abstract String getUrl();

    public int index() {
        return this.indexNum;
    }

    public String name() {
        return this.nameString;
    }

    public boolean needToSendData() {
        return true;
    }

    public void setUrl(String str) {
    }
}
