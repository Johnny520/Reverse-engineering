package org.simpleframework.xml.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;
import yyds.AbstractC0708;
import yyds.AbstractC1465;
import yyds.C0188;
import yyds.C2109;
import yyds.InterfaceC1748;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class StreamProvider implements Provider {
    private final AbstractC0708 factory;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: SecurityException -> 0x0076, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x0076, blocks: (B:25:0x0063, B:27:0x0069), top: B:61:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StreamProvider() {
        ClassLoader classLoader;
        Object objM2972;
        InputStream systemResourceAsStream;
        File file;
        String property;
        Class<AbstractC1465> cls = AbstractC1465.class;
        boolean z = AbstractC1465.f6972;
        try {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                Class<AbstractC1465> cls2 = AbstractC1465.f6973;
                if (cls2 == null) {
                    AbstractC1465.f6973 = cls;
                    cls2 = cls;
                }
                stringBuffer.append(cls2.getName());
                stringBuffer.append("$ClassLoaderFinderConcrete");
                if (Class.forName(stringBuffer.toString()).newInstance() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (Exception e) {
                throw new C2109(e.toString(), e);
            }
        } catch (ClassNotFoundException unused) {
            Class<AbstractC1465> cls3 = AbstractC1465.f6973;
            if (cls3 == null) {
                AbstractC1465.f6973 = cls;
            } else {
                cls = cls3;
            }
            classLoader = cls.getClassLoader();
            boolean z2 = AbstractC1465.f6972;
            try {
                property = System.getProperty("javax.xml.stream.XMLInputFactory");
            } catch (SecurityException unused2) {
            }
            if (property == null) {
                AbstractC1465.m2971("found system property".concat(property));
                objM2972 = AbstractC1465.m2972(classLoader, property);
            } else {
                try {
                    String property2 = System.getProperty("java.home");
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(property2);
                    String str = File.separator;
                    stringBuffer2.append(str);
                    stringBuffer2.append("lib");
                    stringBuffer2.append(str);
                    stringBuffer2.append("jaxp.properties");
                    file = new File(stringBuffer2.toString());
                } catch (Exception e2) {
                    if (z2) {
                        e2.printStackTrace();
                    }
                }
                if (file.exists()) {
                    Properties properties = new Properties();
                    properties.load(new FileInputStream(file));
                    String property3 = properties.getProperty("javax.xml.stream.XMLInputFactory");
                    if (property3 == null || property3.length() <= 0) {
                        try {
                            systemResourceAsStream = classLoader == null ? ClassLoader.getSystemResourceAsStream("META-INF/services/javax.xml.stream.XMLInputFactory") : classLoader.getResourceAsStream("META-INF/services/javax.xml.stream.XMLInputFactory");
                        } catch (Exception e3) {
                            if (z2) {
                                e3.printStackTrace();
                            }
                        }
                        if (systemResourceAsStream != null) {
                            AbstractC1465.m2971("found META-INF/services/javax.xml.stream.XMLInputFactory");
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(systemResourceAsStream, "UTF-8"));
                            String line = bufferedReader.readLine();
                            bufferedReader.close();
                            if (line == null || "".equals(line)) {
                                AbstractC1465.m2971("loaded from fallback value: ".concat("com.bea.xml.stream.MXParserFactory"));
                                objM2972 = AbstractC1465.m2972(classLoader, "com.bea.xml.stream.MXParserFactory");
                            } else {
                                AbstractC1465.m2971("loaded from services: ".concat(line));
                                objM2972 = AbstractC1465.m2972(classLoader, line);
                            }
                        }
                    } else {
                        AbstractC1465.m2971("found java.home property ".concat(property3));
                        objM2972 = AbstractC1465.m2972(classLoader, property3);
                    }
                }
            }
            if (objM2972 != null) {
                return;
            }
            C0188.m794();
            throw null;
        } catch (LinkageError unused3) {
            Class<AbstractC1465> cls4 = AbstractC1465.f6973;
            if (cls4 == null) {
                AbstractC1465.f6973 = cls;
            } else {
                cls = cls4;
            }
            classLoader = cls.getClassLoader();
            boolean z22 = AbstractC1465.f6972;
            property = System.getProperty("javax.xml.stream.XMLInputFactory");
            if (property == null) {
            }
            if (objM2972 != null) {
            }
        }
    }

    private EventReader provide(InterfaceC1748 interfaceC1748) {
        return new StreamReader(interfaceC1748);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) {
        throw null;
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) {
        throw null;
    }
}
