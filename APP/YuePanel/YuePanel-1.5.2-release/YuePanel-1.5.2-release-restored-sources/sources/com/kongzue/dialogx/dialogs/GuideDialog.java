package com.kongzue.dialogx.dialogs;

import Yue.InterfaceC3897;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LifecycleOwner;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.dialogs.CustomDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.DialogLifecycleCallback;
import com.kongzue.dialogx.interfaces.DialogXAnimInterface;
import com.kongzue.dialogx.interfaces.DialogXRunnable;
import com.kongzue.dialogx.interfaces.DialogXStyle;
import com.kongzue.dialogx.interfaces.OnBackPressedListener;
import com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class GuideDialog extends CustomDialog {
    int[] baseViewLocCache;
    protected int[] baseViewLocationCoordinateCompensation;
    protected Integer maskColor;
    protected OnDialogButtonClickListener<GuideDialog> onStageLightPathClickListener;
    protected float stageLightFilletRadius;
    Paint stageLightPaint;
    View stageLightPathStub;
    protected STAGE_LIGHT_TYPE stageLightType;
    protected Drawable tipImage;

    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.GuideDialog$3 */
    public static /* synthetic */ class C24653 {

        /* JADX INFO: renamed from: $SwitchMap$com$kongzue$dialogx$dialogs$GuideDialog$STAGE_LIGHT_TYPE */
        static final /* synthetic */ int[] f4163x7ee17c2b;

        static {
            int[] iArr = new int[STAGE_LIGHT_TYPE.values().length];
            f4163x7ee17c2b = iArr;
            try {
                iArr[STAGE_LIGHT_TYPE.CIRCLE_OUTSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4163x7ee17c2b[STAGE_LIGHT_TYPE.CIRCLE_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4163x7ee17c2b[STAGE_LIGHT_TYPE.RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4163x7ee17c2b[STAGE_LIGHT_TYPE.SQUARE_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4163x7ee17c2b[STAGE_LIGHT_TYPE.SQUARE_OUTSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum STAGE_LIGHT_TYPE {
        RECTANGLE,
        SQUARE_OUTSIDE,
        SQUARE_INSIDE,
        CIRCLE_OUTSIDE,
        CIRCLE_INSIDE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GuideDialog() {
        this.stageLightType = STAGE_LIGHT_TYPE.CIRCLE_OUTSIDE;
        this.maskColor = null;
        this.baseViewLocationCoordinateCompensation = new int[4];
        this.enterAnimResId = C2413R.anim.anim_dialogx_alpha_enter;
        this.exitAnimResId = C2413R.anim.anim_dialogx_default_exit;
        this.alignViewGravity = 81;
    }

    public static GuideDialog build() {
        return new GuideDialog();
    }

    private Paint getStageLightPaint() {
        if (this.stageLightPaint == null) {
            Paint paint = new Paint();
            this.stageLightPaint = paint;
            paint.setColor(-65536);
            this.stageLightPaint.setStyle(Paint.Style.FILL);
            this.stageLightPaint.setAntiAlias(true);
        }
        return this.stageLightPaint;
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
        dismiss();
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public String dialogKey() {
        return getClass().getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    public int[] getBaseViewLocationCoordinateCompensation() {
        return this.baseViewLocationCoordinateCompensation;
    }

    public int getBaseViewLocationCoordinateCompensationBottom() {
        return this.baseViewLocationCoordinateCompensation[3];
    }

    public int getBaseViewLocationCoordinateCompensationLeft() {
        return this.baseViewLocationCoordinateCompensation[0];
    }

    public int getBaseViewLocationCoordinateCompensationRight() {
        return this.baseViewLocationCoordinateCompensation[2];
    }

    public int getBaseViewLocationCoordinateCompensationTop() {
        return this.baseViewLocationCoordinateCompensation[1];
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public CustomDialog.DialogImpl getDialogImpl() {
        return this.dialogImpl;
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public DialogXAnimInterface<CustomDialog> getDialogXAnimImpl() {
        return this.dialogXAnimImpl;
    }

    public OnDialogButtonClickListener<GuideDialog> getOnStageLightPathClickListener() {
        return this.onStageLightPathClickListener;
    }

    public float getStageLightFilletRadius() {
        return this.stageLightFilletRadius;
    }

    public STAGE_LIGHT_TYPE getStageLightType() {
        return this.stageLightType;
    }

    public Drawable getTipImage() {
        return this.tipImage;
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void onDialogRefreshUI() {
        super.onDialogRefreshUI();
        if (this.onBindView == null && this.tipImage != null) {
            getDialogImpl().boxCustom.setFocusable(false);
            getDialogImpl().boxCustom.setFocusableInTouchMode(false);
            getDialogImpl().boxCustom.setOnClickListener(null);
            getDialogImpl().boxCustom.setClickable(false);
            ImageView imageView = new ImageView(getOwnActivity());
            imageView.setImageDrawable(this.tipImage);
            imageView.setAdjustViewBounds(true);
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            OnBindView<CustomDialog> onBindView = new OnBindView<CustomDialog>(imageView) { // from class: com.kongzue.dialogx.dialogs.GuideDialog.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: onBind(Ljava/lang/Object;Landroid/view/View;)V */
                @Override // com.kongzue.dialogx.interfaces.OnBindView
                public void onBind(CustomDialog customDialog, View view) {
                }
            };
            this.onBindView = onBindView;
            onBindView.bindParent(getDialogImpl().boxCustom, this.f4161me);
        }
        if (getOnStageLightPathClickListener() != null && baseView() != null) {
            View view = new View(getOwnActivity());
            this.stageLightPathStub = view;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.kongzue.dialogx.dialogs.GuideDialog.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (GuideDialog.this.getOnStageLightPathClickListener().onClick(GuideDialog.this, view2)) {
                        return;
                    }
                    GuideDialog.this.dismiss();
                }
            });
            getDialogImpl().boxRoot.addView(this.stageLightPathStub);
            return;
        }
        View view2 = this.stageLightPathStub;
        if (view2 == null || !(view2.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.stageLightPathStub.getParent()).removeView(this.stageLightPathStub);
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void onDialogShow() {
        super.onDialogShow();
        if (baseView() == null) {
            Integer num = this.maskColor;
            super.setMaskColor(num == null ? getColor(C2413R.color.black50) : num.intValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog onDismiss(DialogXRunnable dialogXRunnable) {
        return onDismiss((DialogXRunnable<CustomDialog>) dialogXRunnable);
    }

    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public void onGetBaseViewLoc(int[] iArr) {
        if (Arrays.equals(iArr, this.baseViewLocCache) || getDialogImpl() == null) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDialogImpl().boxRoot.getWidth(), getDialogImpl().boxRoot.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i = iArr[0];
        int[] iArr2 = this.baseViewLocationCoordinateCompensation;
        int i2 = i + iArr2[0];
        int i3 = iArr[1] + iArr2[1];
        int i4 = iArr[2] + iArr2[2];
        int i5 = iArr[3] + iArr2[3];
        int i6 = i4 / 2;
        int i7 = i5 / 2;
        View view = this.stageLightPathStub;
        if (view != null) {
            float f = i2;
            if (view.getX() != f || this.stageLightPathStub.getY() != i3) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.stageLightPathStub.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(i4, i5);
                } else {
                    layoutParams.width = i4;
                    layoutParams.height = i5;
                }
                this.stageLightPathStub.setLayoutParams(layoutParams);
                this.stageLightPathStub.setX(f);
                this.stageLightPathStub.setY(i3);
            }
        }
        int i8 = C24653.f4163x7ee17c2b[this.stageLightType.ordinal()];
        if (i8 == 1) {
            canvas.drawCircle(i2 + i6, i3 + i7, (int) Math.sqrt((i6 * i6) + (i7 * i7)), getStageLightPaint());
        } else if (i8 == 2) {
            canvas.drawCircle(i2 + i6, i3 + i7, Math.min(i4, i5) / 2, getStageLightPaint());
        } else if (i8 == 3) {
            RectF rectF = new RectF(i2, i3, i2 + i4, i3 + i5);
            float f2 = this.stageLightFilletRadius;
            canvas.drawRoundRect(rectF, f2, f2, getStageLightPaint());
        } else if (i8 == 4) {
            int i9 = i2 + i6;
            int iMin = Math.min(i4, i5) / 2;
            RectF rectF2 = new RectF(i9 - iMin, (i3 + i7) - iMin, r3 + r2, r5 + r2);
            float f3 = this.stageLightFilletRadius;
            canvas.drawRoundRect(rectF2, f3, f3, getStageLightPaint());
        } else if (i8 == 5) {
            int i10 = i2 + i6;
            int iMax = Math.max(i4, i5) / 2;
            RectF rectF3 = new RectF(i10 - iMax, (i3 + i7) - iMax, r3 + r2, r5 + r2);
            float f4 = this.stageLightFilletRadius;
            canvas.drawRoundRect(rectF3, f4, f4, getStageLightPaint());
        }
        this.stageLightPaint.setXfermode(null);
        Integer num = this.maskColor;
        canvas.drawColor(num == null ? getColor(C2413R.color.black50) : num.intValue(), PorterDuff.Mode.SRC_OUT);
        getDialogImpl().boxRoot.setBackground(new BitmapDrawable(getResources(), bitmapCreateBitmap));
        this.baseViewLocCache = Arrays.copyOf(iArr, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog onShow(DialogXRunnable dialogXRunnable) {
        return onShow((DialogXRunnable<CustomDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog setActionRunnable(int i, DialogXRunnable dialogXRunnable) {
        return setActionRunnable(i, (DialogXRunnable<CustomDialog>) dialogXRunnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GuideDialog setBaseViewLocationCoordinateCompensation(int[] iArr) {
        this.baseViewLocationCoordinateCompensation = iArr;
        return this;
    }

    public GuideDialog setBaseViewLocationCoordinateCompensationBottom(int i) {
        this.baseViewLocationCoordinateCompensation[3] = i;
        refreshUI();
        return this;
    }

    public GuideDialog setBaseViewLocationCoordinateCompensationLeft(int i) {
        this.baseViewLocationCoordinateCompensation[0] = i;
        refreshUI();
        return this;
    }

    public GuideDialog setBaseViewLocationCoordinateCompensationRight(int i) {
        this.baseViewLocationCoordinateCompensation[2] = i;
        refreshUI();
        return this;
    }

    public GuideDialog setBaseViewLocationCoordinateCompensationTop(int i) {
        this.baseViewLocationCoordinateCompensation[1] = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog setCustomView(OnBindView onBindView) {
        return setCustomView((OnBindView<CustomDialog>) onBindView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog setDialogLifecycleCallback(DialogLifecycleCallback dialogLifecycleCallback) {
        return setDialogLifecycleCallback((DialogLifecycleCallback<CustomDialog>) dialogLifecycleCallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog setDialogXAnimImpl(DialogXAnimInterface dialogXAnimInterface) {
        return setDialogXAnimImpl((DialogXAnimInterface<CustomDialog>) dialogXAnimInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        return setOnBackPressedListener((OnBackPressedListener<CustomDialog>) onBackPressedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public /* bridge */ /* synthetic */ CustomDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener onBackgroundMaskClickListener) {
        return setOnBackgroundMaskClickListener((OnBackgroundMaskClickListener<CustomDialog>) onBackgroundMaskClickListener);
    }

    public GuideDialog setOnStageLightPathClickListener(OnDialogButtonClickListener<GuideDialog> onDialogButtonClickListener) {
        this.onStageLightPathClickListener = onDialogButtonClickListener;
        refreshUI();
        return this;
    }

    public GuideDialog setStageLightFilletRadius(float f) {
        this.stageLightFilletRadius = f;
        refreshUI();
        return this;
    }

    public GuideDialog setStageLightType(STAGE_LIGHT_TYPE stage_light_type) {
        this.stageLightType = stage_light_type;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GuideDialog setTipImage(int i) {
        this.tipImage = getResources().getDrawable(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: baseView(Landroid/view/View;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog baseView(View view) {
        super.baseView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bindDismissWithLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog bindDismissWithLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.bindDismissWithLifecycleOwnerPrivate(lifecycleOwner);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: bringToFront()Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog bringToFront() {
        setThisOrderIndex(getHighestOrderIndex());
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAction(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog cleanAction(int i) {
        this.dialogActionRunnableMap.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: cleanAllAction()Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog cleanAllAction() {
        this.dialogActionRunnableMap.clear();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog onDismiss(DialogXRunnable<CustomDialog> dialogXRunnable) {
        this.onDismissRunnable = dialogXRunnable;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog onShow(DialogXRunnable<CustomDialog> dialogXRunnable) {
        DialogXRunnable dialogXRunnable2;
        this.onShowRunnable = dialogXRunnable;
        if (isShow() && (dialogXRunnable2 = this.onShowRunnable) != null) {
            dialogXRunnable2.run(this);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: removeCustomView()Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog removeCustomView() {
        this.onBindView.clean();
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setActionRunnable(int i, DialogXRunnable<CustomDialog> dialogXRunnable) {
        this.dialogActionRunnableMap.put(Integer.valueOf(i), dialogXRunnable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAlign(Lcom/kongzue/dialogx/dialogs/CustomDialog$ALIGN;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setAlign(CustomDialog.ALIGN align) {
        this.align = align;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAnimResId(II)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setAnimResId(int i, int i2) {
        this.enterAnimResId = i;
        this.exitAnimResId = i2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAutoUnsafePlacePadding(Z)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setAutoUnsafePlacePadding(boolean z) {
        super.setAutoUnsafePlacePadding(z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public GuideDialog setBaseViewLocationCoordinateCompensation(int i) {
        this.baseViewLocationCoordinateCompensation = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBaseViewMarginBottom(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setBaseViewMarginBottom(int i) {
        this.marginRelativeBaseView[3] = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBaseViewMarginLeft(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setBaseViewMarginLeft(int i) {
        this.marginRelativeBaseView[0] = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBaseViewMarginRight(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setBaseViewMarginRight(int i) {
        this.marginRelativeBaseView[2] = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBaseViewMarginTop(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setBaseViewMarginTop(int i) {
        this.marginRelativeBaseView[1] = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setBkgInterceptTouch(Z)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setBkgInterceptTouch(boolean z) {
        this.bkgInterceptTouch = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setCancelable(Z)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setCancelable(boolean z) {
        this.privateCancelable = z ? BaseDialog.BOOLEAN.TRUE : BaseDialog.BOOLEAN.FALSE;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setCustomView(OnBindView<CustomDialog> onBindView) {
        this.onBindView = onBindView;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setDialogImplMode(Lcom/kongzue/dialogx/DialogX$IMPL_MODE;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setDialogImplMode(DialogX.IMPL_MODE impl_mode) {
        this.dialogImplMode = impl_mode;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setDialogLifecycleCallback(DialogLifecycleCallback<CustomDialog> dialogLifecycleCallback) {
        this.dialogLifecycleCallback = dialogLifecycleCallback;
        if (this.isShow) {
            dialogLifecycleCallback.onShow(this.f4161me);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setDialogXAnimImpl(DialogXAnimInterface<CustomDialog> dialogXAnimInterface) {
        this.dialogXAnimImpl = dialogXAnimInterface;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnterAnimDuration(J)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setEnterAnimDuration(long j) {
        this.enterAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setEnterAnimResId(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setEnterAnimResId(int i) {
        this.enterAnimResId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setExitAnimDuration(J)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setExitAnimDuration(long j) {
        this.exitAnimDuration = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setExitAnimResId(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setExitAnimResId(int i) {
        this.exitAnimResId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setFullScreen(Z)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setFullScreen(boolean z) {
        super.setFullScreen(z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setHeight(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setHeight(int i) {
        this.height = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setMaskColor(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setMaskColor(@InterfaceC3897 int i) {
        this.maskColor = Integer.valueOf(i);
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setOnBackPressedListener(OnBackPressedListener<CustomDialog> onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setOnBackgroundMaskClickListener(OnBackgroundMaskClickListener<CustomDialog> onBackgroundMaskClickListener) {
        this.onBackgroundMaskClickListener = onBackgroundMaskClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setStyle(Lcom/kongzue/dialogx/interfaces/DialogXStyle;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setStyle(DialogXStyle dialogXStyle) {
        this.style = dialogXStyle;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setTheme(Lcom/kongzue/dialogx/DialogX$THEME;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setTheme(DialogX.THEME theme) {
        this.theme = theme;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setWidth(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setWidth(int i) {
        this.width = i;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setBaseViewMargin([I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setBaseViewMargin(int[] iArr) {
        this.marginRelativeBaseView = iArr;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setCustomDialogLayoutResId(int i) {
        int[] iArr = this.customDialogLayoutResId;
        iArr[0] = i;
        iArr[1] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    /* JADX DEBUG: Method merged with bridge method: setData(Ljava/lang/String;Ljava/lang/Object;)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public GuideDialog setData(String str, Object obj) {
        if (this.data == null) {
            this.data = new HashMap();
        }
        this.data.put(str, obj);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    /* JADX DEBUG: Method merged with bridge method: setEnableImmersiveMode(Z)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public GuideDialog setEnableImmersiveMode(boolean z) {
        this.enableImmersiveMode = z;
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setRootPadding(int i) {
        this.screenPaddings = new int[]{i, i, i, i};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    /* JADX DEBUG: Method merged with bridge method: setThisOrderIndex(I)Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public GuideDialog setThisOrderIndex(int i) {
        this.thisOrderIndex = i;
        if (getDialogView() != null) {
            getDialogView().setTranslationZ(i);
        }
        return this;
    }

    public GuideDialog setTipImage(Bitmap bitmap) {
        this.tipImage = new BitmapDrawable(getResources(), bitmap);
        refreshUI();
        return this;
    }

    public static GuideDialog show(OnBindView<CustomDialog> onBindView) {
        GuideDialog guideDialog = new GuideDialog(onBindView);
        guideDialog.show();
        return guideDialog;
    }

    /* JADX DEBUG: Method merged with bridge method: setAlignBaseViewGravity(Landroid/view/View;I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setAlignBaseViewGravity(View view, int i) {
        baseView(view);
        this.alignViewGravity = i;
        int[] iArr = new int[4];
        this.baseViewLoc = iArr;
        view.getLocationInWindow(iArr);
        setFullScreen(true);
        return this;
    }

    public GuideDialog setBaseViewLocationCoordinateCompensation(int i, int i2, int i3, int i4) {
        this.baseViewLocationCoordinateCompensation = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setBaseViewMargin(IIII)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setBaseViewMargin(int i, int i2, int i3, int i4) {
        this.marginRelativeBaseView = new int[]{i, i2, i3, i4};
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setCustomDialogLayoutResId(IZ)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setCustomDialogLayoutResId(int i, boolean z) {
        this.customDialogLayoutResId[!z ? 1 : 0] = i;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: setRootPadding(IIII)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setRootPadding(int i, int i2, int i3, int i4) {
        this.screenPaddings = new int[]{i, i2, i3, i4};
        refreshUI();
        return this;
    }

    public GuideDialog setTipImage(Drawable drawable) {
        this.tipImage = drawable;
        refreshUI();
        return this;
    }

    public static GuideDialog show(OnBindView<CustomDialog> onBindView, CustomDialog.ALIGN align) {
        GuideDialog guideDialog = new GuideDialog(onBindView);
        guideDialog.align = align;
        guideDialog.show();
        return guideDialog;
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type) {
        this();
        baseView(view);
        this.stageLightType = stage_light_type;
    }

    public static GuideDialog show(int i) {
        return new GuideDialog(i).show();
    }

    public GuideDialog setAlignBaseViewGravity(View view) {
        baseView(view);
        int[] iArr = new int[4];
        this.baseViewLoc = iArr;
        view.getLocationInWindow(iArr);
        setFullScreen(true);
        return this;
    }

    public static GuideDialog show(Bitmap bitmap) {
        return new GuideDialog(bitmap).show();
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type, OnBindView<CustomDialog> onBindView, int i) {
        this();
        baseView(view);
        this.stageLightType = stage_light_type;
        this.onBindView = onBindView;
        this.alignViewGravity = i;
    }

    public static GuideDialog show(Drawable drawable) {
        return new GuideDialog(drawable).show();
    }

    public static GuideDialog show(int i, CustomDialog.ALIGN align) {
        GuideDialog guideDialog = new GuideDialog(i, align);
        guideDialog.align = align;
        return guideDialog.show();
    }

    /* JADX DEBUG: Method merged with bridge method: setAlignBaseViewGravity(I)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setAlignBaseViewGravity(int i) {
        this.alignViewGravity = i;
        if (baseView() != null) {
            this.baseViewLoc = new int[4];
            baseView().getLocationInWindow(this.baseViewLoc);
        }
        setFullScreen(true);
        return this;
    }

    public static GuideDialog show(Bitmap bitmap, CustomDialog.ALIGN align) {
        GuideDialog guideDialog = new GuideDialog(bitmap, align);
        guideDialog.align = align;
        return guideDialog.show();
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type, int i, int i2) {
        this();
        baseView(view);
        this.tipImage = getResources().getDrawable(i);
        this.stageLightType = stage_light_type;
        this.alignViewGravity = i2;
    }

    public static GuideDialog show(Drawable drawable, CustomDialog.ALIGN align) {
        return new GuideDialog(drawable, align).show();
    }

    /* JADX DEBUG: Method merged with bridge method: setAlignBaseViewGravity(Landroid/view/View;IIIII)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog setAlignBaseViewGravity(View view, int i, int i2, int i3, int i4, int i5) {
        this.marginRelativeBaseView = new int[]{i2, i3, i4, i5};
        return setAlignBaseViewGravity(view, i);
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type) {
        return new GuideDialog(view, stage_light_type).show();
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type, OnBindView<CustomDialog> onBindView, int i) {
        return new GuideDialog(view, stage_light_type, onBindView, i).show();
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type, Bitmap bitmap, int i) {
        this();
        baseView(view);
        this.tipImage = new BitmapDrawable(getResources(), bitmap);
        this.stageLightType = stage_light_type;
        this.alignViewGravity = i;
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type, int i, int i2) {
        return new GuideDialog(view, stage_light_type, i, i2).show();
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type, Bitmap bitmap, int i) {
        return new GuideDialog(view, stage_light_type, bitmap, i).show();
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type, Drawable drawable, int i) {
        return new GuideDialog(view, stage_light_type, drawable, i).show();
    }

    public static GuideDialog show(View view, int i) {
        return new GuideDialog(view, i).show();
    }

    public static GuideDialog show(View view, Bitmap bitmap) {
        return new GuideDialog(view, bitmap).show();
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type, Drawable drawable, int i) {
        this();
        baseView(view);
        this.tipImage = drawable;
        this.stageLightType = stage_light_type;
        this.alignViewGravity = i;
    }

    public static GuideDialog show(View view, Drawable drawable) {
        return new GuideDialog(view, drawable).show();
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type, int i) {
        return new GuideDialog(view, stage_light_type, i).show();
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type, Bitmap bitmap) {
        return new GuideDialog(view, stage_light_type, bitmap).show();
    }

    public static GuideDialog show(View view, STAGE_LIGHT_TYPE stage_light_type, Drawable drawable) {
        return new GuideDialog(view, stage_light_type, drawable).show();
    }

    public static GuideDialog show(View view, int i, int i2) {
        return new GuideDialog(view, i, i2).show();
    }

    public GuideDialog(int i) {
        this();
        this.tipImage = getResources().getDrawable(i);
    }

    public static GuideDialog show(View view, Bitmap bitmap, int i) {
        return new GuideDialog(view, bitmap, i).show();
    }

    public static GuideDialog show(View view, Drawable drawable, int i) {
        return new GuideDialog(view, drawable, i).show();
    }

    public GuideDialog(Bitmap bitmap) {
        this();
        this.tipImage = new BitmapDrawable(getResources(), bitmap);
    }

    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    /* JADX DEBUG: Method merged with bridge method: show()Lcom/kongzue/dialogx/interfaces/BaseDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public GuideDialog show() {
        super.show();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: show(Landroid/app/Activity;)Lcom/kongzue/dialogx/dialogs/CustomDialog; */
    @Override // com.kongzue.dialogx.dialogs.CustomDialog
    public GuideDialog show(Activity activity) {
        super.show(activity);
        return this;
    }

    public GuideDialog(Drawable drawable) {
        this();
        this.tipImage = drawable;
    }

    public GuideDialog(int i, CustomDialog.ALIGN align) {
        this();
        this.tipImage = getResources().getDrawable(i);
        this.align = align;
    }

    public GuideDialog(Bitmap bitmap, CustomDialog.ALIGN align) {
        this();
        this.tipImage = new BitmapDrawable(getResources(), bitmap);
        this.align = align;
    }

    public GuideDialog(Drawable drawable, CustomDialog.ALIGN align) {
        this();
        this.tipImage = drawable;
        this.align = align;
    }

    public GuideDialog(OnBindView<CustomDialog> onBindView) {
        this();
        this.onBindView = onBindView;
    }

    public GuideDialog(OnBindView<CustomDialog> onBindView, CustomDialog.ALIGN align) {
        this();
        this.onBindView = onBindView;
        this.align = align;
    }

    public GuideDialog(View view, int i) {
        this();
        baseView(view);
        this.tipImage = getResources().getDrawable(i);
    }

    public GuideDialog(View view, Bitmap bitmap) {
        this();
        baseView(view);
        this.tipImage = new BitmapDrawable(getResources(), bitmap);
    }

    public GuideDialog(View view, Drawable drawable) {
        this();
        baseView(view);
        this.tipImage = drawable;
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type, int i) {
        this();
        baseView(view);
        this.stageLightType = stage_light_type;
        this.tipImage = getResources().getDrawable(i);
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type, Bitmap bitmap) {
        this();
        baseView(view);
        this.stageLightType = stage_light_type;
        this.tipImage = new BitmapDrawable(getResources(), bitmap);
    }

    public GuideDialog(View view, STAGE_LIGHT_TYPE stage_light_type, Drawable drawable) {
        this();
        baseView(view);
        this.stageLightType = stage_light_type;
        this.tipImage = drawable;
    }

    public GuideDialog(View view, int i, int i2) {
        this();
        baseView(view);
        this.alignViewGravity = i2;
        this.tipImage = getResources().getDrawable(i);
    }

    public GuideDialog(View view, Bitmap bitmap, int i) {
        this();
        baseView(view);
        this.alignViewGravity = i;
        this.tipImage = new BitmapDrawable(getResources(), bitmap);
    }

    public GuideDialog(View view, Drawable drawable, int i) {
        this();
        baseView(view);
        this.alignViewGravity = i;
        this.tipImage = drawable;
    }
}
