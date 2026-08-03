package Yue;

import java.io.OutputStream;
import java.io.Writer;
import javax.xml.transform.Result;

/* JADX INFO: renamed from: Yue.ۥۢۦۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8554 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3553 = "javax.xml.stream.isRepairingNamespaces";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static AbstractC8554 m28453() throws C4783 {
        return (AbstractC8554) C4785.m14456("javax.xml.stream.XMLOutputFactory", "com.bea.xml.stream.XMLOutputFactoryBase");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static AbstractC8554 m28454(String str, ClassLoader classLoader) throws C4783 {
        return (AbstractC8554) C4785.m14457(str, "com.bea.xml.stream.XMLOutputFactoryBase", classLoader);
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract InterfaceC8551 mo4530(OutputStream outputStream) throws C8559;

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract InterfaceC8551 mo4531(OutputStream outputStream, String str) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract InterfaceC8551 mo28455(Writer writer) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract InterfaceC8551 mo28456(Result result) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract InterfaceC8563 mo28457(OutputStream outputStream) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract InterfaceC8563 mo28458(OutputStream outputStream, String str) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract InterfaceC8563 mo28459(Writer writer) throws C8559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract InterfaceC8563 mo28460(Result result) throws C8559;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract Object mo28461(String str) throws IllegalArgumentException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public abstract boolean mo28462(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract void mo28463(String str, Object obj) throws IllegalArgumentException;
}
