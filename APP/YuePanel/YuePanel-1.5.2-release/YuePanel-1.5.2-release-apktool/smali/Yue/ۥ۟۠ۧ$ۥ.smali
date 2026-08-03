.class public LYue/ۥ۟۠ۧ$ۥ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۠ۧ;->ۥ۟۟۟۟(Landroid/view/View;IILjava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۠ۧ$ۥ;->ۥ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native onAnimationCancel(Landroid/animation/Animator;)V
.end method

.method public native onAnimationEnd(Landroid/animation/Animator;)V
.end method

.method public native onAnimationRepeat(Landroid/animation/Animator;)V
.end method

.method public native onAnimationStart(Landroid/animation/Animator;)V
.end method
