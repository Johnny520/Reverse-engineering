package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8170 extends C7140 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f24262 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f24263 = 20;

    /* JADX INFO: renamed from: ۥ۟ */
    public final WeakReference<Context> f3276;

    public C8170(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources) {
        super(resources);
        this.f3276 = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m26952() {
        return f24262;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m26953(boolean z) {
        f24262 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m26954() {
        m26952();
        return false;
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return super.getAnimation(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) throws Resources.NotFoundException {
        return super.getBoolean(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i) throws Resources.NotFoundException {
        return super.getColor(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return super.getColorStateList(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i) throws Resources.NotFoundException {
        return super.getDimension(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.C7140, android.content.res.Resources
    @InterfaceC7113(21)
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i, theme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i, i2);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i) throws Resources.NotFoundException {
        return super.getIntArray(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i) throws Resources.NotFoundException {
        return super.getInteger(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return super.getLayout(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i) throws Resources.NotFoundException {
        return super.getMovie(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityText(i, i2);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i) throws Resources.NotFoundException {
        return super.getResourceEntryName(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i) throws Resources.NotFoundException {
        return super.getResourceName(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i) throws Resources.NotFoundException {
        return super.getResourcePackageName(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i) throws Resources.NotFoundException {
        return super.getResourceTypeName(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i) throws Resources.NotFoundException {
        return super.getString(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i) throws Resources.NotFoundException {
        return super.getStringArray(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i) throws Resources.NotFoundException {
        return super.getText(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return super.getTextArray(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(i, typedValue, z);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return super.getXml(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return super.obtainTypedArray(i);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i) throws Resources.NotFoundException {
        return super.openRawResource(i);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ void mo3429(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.mo3429(str, typedValue, z);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥ۟۟ */
    public /* bridge */ /* synthetic */ void mo22291(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.mo22291(i, i2, typedValue, z);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ TypedArray mo22292(AttributeSet attributeSet, int[] iArr) {
        return super.mo22292(attributeSet, iArr);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ InputStream mo22293(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return super.mo22293(i, typedValue);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public /* bridge */ /* synthetic */ AssetFileDescriptor mo22294(int i) throws Resources.NotFoundException {
        return super.mo22294(i);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public /* bridge */ /* synthetic */ void mo22295(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.mo22295(str, attributeSet, bundle);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public /* bridge */ /* synthetic */ void mo22296(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.mo22296(xmlResourceParser, bundle);
    }

    @Override // Yue.C7140
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public /* bridge */ /* synthetic */ void mo22297(Configuration configuration, DisplayMetrics displayMetrics) {
        super.mo22297(configuration, displayMetrics);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.C7140, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f3276.get();
        return context != null ? C7124.m22248().m22264(context, this, i) : m3428(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.C7140, android.content.res.Resources
    @InterfaceC7113(21)
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.C7140, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i, CharSequence charSequence) {
        return super.getText(i, charSequence);
    }
}
