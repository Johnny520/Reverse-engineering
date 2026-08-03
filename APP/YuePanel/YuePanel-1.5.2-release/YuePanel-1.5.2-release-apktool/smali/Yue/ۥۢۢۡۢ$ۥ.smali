.class public LYue/ۥۢۢۡۢ$ۥ;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۢۡۢ;->ۥ۟۟۟۟(Landroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Z

.field public final synthetic ۥ۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1e7

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۢۢۡۢ$ۥ;->ۥ:Z

    iput p2, p0, LYue/ۥۢۢۡۢ$ۥ;->ۥ۟:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public native onAnimationEnd(Landroid/animation/Animator;)V
.end method
