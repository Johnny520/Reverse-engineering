package Yue;

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
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۡۦۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7140 extends Resources {

    /* JADX INFO: renamed from: ۥ */
    public final Resources f2704;

    public C7140(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2704 = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return this.f2704.getAnimation(i);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) throws Resources.NotFoundException {
        return this.f2704.getBoolean(i);
    }

    @Override // android.content.res.Resources
    public int getColor(int i) throws Resources.NotFoundException {
        return this.f2704.getColor(i);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return this.f2704.getColorStateList(i);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f2704.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) throws Resources.NotFoundException {
        return this.f2704.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return this.f2704.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return this.f2704.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f2704.getDisplayMetrics();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.f2704.getDrawable(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return C7130.m22276(this.f2704, i, i2, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.f2704.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f2704.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) throws Resources.NotFoundException {
        return this.f2704.getIntArray(i);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) throws Resources.NotFoundException {
        return this.f2704.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return this.f2704.getLayout(i);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) throws Resources.NotFoundException {
        return this.f2704.getMovie(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return this.f2704.getQuantityString(i, i2, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return this.f2704.getQuantityText(i, i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.f2704.getResourceEntryName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.f2704.getResourceName(i);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.f2704.getResourcePackageName(i);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.f2704.getResourceTypeName(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.res.Resources
    public String getString(int i) throws Resources.NotFoundException {
        return this.f2704.getString(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) throws Resources.NotFoundException {
        return this.f2704.getStringArray(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.res.Resources
    public CharSequence getText(int i) throws Resources.NotFoundException {
        return this.f2704.getText(i);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return this.f2704.getTextArray(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f2704.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return this.f2704.getXml(i);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return this.f2704.obtainTypedArray(i);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        return this.f2704.openRawResource(i);
    }

    /* JADX INFO: renamed from: ۥ */
    public final Drawable m3428(int i) throws Resources.NotFoundException {
        return super.getDrawable(i);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void mo3429(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f2704.getValue(str, typedValue, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo22291(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.f2704.getValueForDensity(i, i2, typedValue, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public TypedArray mo22292(AttributeSet attributeSet, int[] iArr) {
        return this.f2704.obtainAttributes(attributeSet, iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InputStream mo22293(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f2704.openRawResource(i, typedValue);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public AssetFileDescriptor mo22294(int i) throws Resources.NotFoundException {
        return this.f2704.openRawResourceFd(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo22295(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f2704.parseBundleExtra(str, attributeSet, bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo22296(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f2704.parseBundleExtras(xmlResourceParser, bundle);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo22297(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f2704;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.content.res.Resources
    @InterfaceC7113(21)
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return C7130.m22275(this.f2704, i, theme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.content.res.Resources
    @InterfaceC7113(21)
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return C7130.m22276(this.f2704, i, i2, theme);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return this.f2704.getQuantityString(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        return this.f2704.getString(i, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f2704.getText(i, charSequence);
    }
}
