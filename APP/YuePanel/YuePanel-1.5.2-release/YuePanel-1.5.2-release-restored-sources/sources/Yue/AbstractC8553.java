package Yue;

import java.io.InputStream;
import java.io.Reader;
import javax.xml.transform.Source;

/* JADX INFO: renamed from: Yue.ۥۢۦۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8553 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3551 = "javax.xml.stream.isNamespaceAware";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3552 = "javax.xml.stream.isValidating";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f25385 = "javax.xml.stream.isCoalescing";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f25386 = "javax.xml.stream.isReplacingEntityReferences";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f25387 = "javax.xml.stream.isSupportingExternalEntities";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f25388 = "javax.xml.stream.supportDTD";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f25389 = "javax.xml.stream.reporter";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f25390 = "javax.xml.stream.resolver";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f25391 = "javax.xml.stream.allocator";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static AbstractC8553 m28451() throws C4783 {
        return (AbstractC8553) C4785.m14456("javax.xml.stream.XMLInputFactory", "com.bea.xml.stream.MXParserFactory");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static AbstractC8553 m28452(String str, ClassLoader classLoader) throws C4783 {
        return (AbstractC8553) C4785.m14457(str, "com.bea.xml.stream.MXParserFactory", classLoader);
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract InterfaceC8549 mo2575(InterfaceC8549 interfaceC8549, InterfaceC4704 interfaceC4704) throws C8559;

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract InterfaceC8561 mo2576(InterfaceC8561 interfaceC8561, InterfaceC7601 interfaceC7601) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract InterfaceC8549 mo18434(InterfaceC8561 interfaceC8561) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public abstract InterfaceC8549 mo18435(InputStream inputStream) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract InterfaceC8549 mo18436(InputStream inputStream, String str) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract InterfaceC8549 mo18437(Reader reader) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public abstract InterfaceC8549 mo18438(String str, InputStream inputStream) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public abstract InterfaceC8549 mo18439(String str, Reader reader) throws C8559;

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public abstract InterfaceC8549 mo18440(Source source) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract InterfaceC8561 mo18441(InputStream inputStream) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public abstract InterfaceC8561 mo18442(InputStream inputStream, String str) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public abstract InterfaceC8561 mo18443(Reader reader) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public abstract InterfaceC8561 mo18444(String str, InputStream inputStream) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public abstract InterfaceC8561 mo18445(String str, Reader reader) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public abstract InterfaceC8561 mo18446(Source source) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public abstract InterfaceC8544 mo18447();

    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public abstract Object mo18448(String str) throws IllegalArgumentException;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public abstract InterfaceC8556 mo18449();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public abstract InterfaceC8557 mo18450();

    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public abstract boolean mo18451(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public abstract void mo18452(InterfaceC8544 interfaceC8544);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public abstract void mo18453(String str, Object obj) throws IllegalArgumentException;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public abstract void mo18454(InterfaceC8556 interfaceC8556);

    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public abstract void mo18455(InterfaceC8557 interfaceC8557);
}
