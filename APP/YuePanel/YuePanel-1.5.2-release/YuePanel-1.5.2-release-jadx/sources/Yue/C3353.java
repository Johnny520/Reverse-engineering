package Yue;

import Yue.C6898;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3353 {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final C7467<String, Constructor<? extends View>> sConstructorMap = new C7467<>();

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۤۤ$ۥ */
    public static class ViewOnClickListenerC0118 implements View.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final View f5316;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final String f5317;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Method f5318;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Context f5319;

        public ViewOnClickListenerC0118(@InterfaceC6391 View view, @InterfaceC6391 String str) {
            this.f5316 = view;
            this.f5317 = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@InterfaceC6391 View view) {
            if (this.f5318 == null) {
                m431(this.f5316.getContext());
            }
            try {
                this.f5318.invoke(this.f5319, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m431(@InterfaceC6490 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f5317, View.class)) != null) {
                        this.f5318 = method;
                        this.f5319 = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f5316.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f5316.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f5317 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f5316.getClass() + str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Context m6866(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19777, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19778, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C6898.C6909.f19782, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof C4198) && ((C4198) context).m12089() == resourceId) ? context : new C4198(context, resourceId) : context;
    }

    @InterfaceC6391
    public C3277 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C3277(context, attributeSet);
    }

    @InterfaceC6391
    public C3284 createButton(Context context, AttributeSet attributeSet) {
        return new C3284(context, attributeSet);
    }

    @InterfaceC6391
    public C3287 createCheckBox(Context context, AttributeSet attributeSet) {
        return new C3287(context, attributeSet);
    }

    @InterfaceC6391
    public C3289 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C3289(context, attributeSet);
    }

    @InterfaceC6391
    public C3306 createEditText(Context context, AttributeSet attributeSet) {
        return new C3306(context, attributeSet);
    }

    @InterfaceC6391
    public C3311 createImageButton(Context context, AttributeSet attributeSet) {
        return new C3311(context, attributeSet);
    }

    @InterfaceC6391
    public C3314 createImageView(Context context, AttributeSet attributeSet) {
        return new C3314(context, attributeSet);
    }

    @InterfaceC6391
    public C3316 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C3316(context, attributeSet);
    }

    @InterfaceC6391
    public C3320 createRadioButton(Context context, AttributeSet attributeSet) {
        return new C3320(context, attributeSet);
    }

    @InterfaceC6391
    public C3321 createRatingBar(Context context, AttributeSet attributeSet) {
        return new C3321(context, attributeSet);
    }

    @InterfaceC6391
    public C3324 createSeekBar(Context context, AttributeSet attributeSet) {
        return new C3324(context, attributeSet);
    }

    @InterfaceC6391
    public C3327 createSpinner(Context context, AttributeSet attributeSet) {
        return new C3327(context, attributeSet);
    }

    @InterfaceC6391
    public C3343 createTextView(Context context, AttributeSet attributeSet) {
        return new C3343(context, attributeSet);
    }

    @InterfaceC6391
    public C3352 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C3352(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    public final View createView(@InterfaceC6490 View view, @InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View viewCreateRatingBar;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m6866(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C7834.m3931(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "CheckedTextView":
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "TextView":
                viewCreateRatingBar = createTextView(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "ImageButton":
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "SeekBar":
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "Spinner":
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "RadioButton":
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "ToggleButton":
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "ImageView":
                viewCreateRatingBar = createImageView(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "AutoCompleteTextView":
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "CheckBox":
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "EditText":
                viewCreateRatingBar = createEditText(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            case "Button":
                viewCreateRatingBar = createButton(context2, attributeSet);
                m6869(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = m6868(context2, str, attributeSet);
        }
        if (viewCreateRatingBar != null) {
            m430(viewCreateRatingBar, attributeSet);
            m429(context2, viewCreateRatingBar, attributeSet);
        }
        return viewCreateRatingBar;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m429(@InterfaceC6391 Context context, @InterfaceC6391 View view, @InterfaceC6391 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            C8273.m27440(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            C8273.m27442(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            C8273.m27481(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m430(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new ViewOnClickListenerC0118(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final View m6867(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        C7467<String, Constructor<? extends View>> c7467 = sConstructorMap;
        Constructor<? extends View> constructor = c7467.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            c7467.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final View m6868(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Name.LABEL);
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m6867(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                View viewM6867 = m6867(context, str, strArr[i]);
                if (viewM6867 != null) {
                    return viewM6867;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m6869(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @InterfaceC6490
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}
