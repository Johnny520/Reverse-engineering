.class public LYue/ۥۡۡۨۦ;
.super Landroid/widget/ScrollView;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/ScrollController;


# instance fields
.field public ۥۣ۟۟۠:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2de

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public native getScrollDistance()I
.end method

.method public native isCanScroll()Z
.end method

.method public native isLockScroll()Z
.end method

.method public native lockScroll(Z)V
.end method

.method public native onTouchEvent(Landroid/view/MotionEvent;)Z
.end method
