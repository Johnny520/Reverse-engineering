.class public final synthetic LYue/ۥۡۢۡۦ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ۥ:LYue/ۥۡۢۡۧ;

.field public final synthetic ۥ۟:F

.field public final synthetic ۥ۟۟:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x38b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۡۢۡۧ;F[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۢۡۦ;->ۥ:LYue/ۥۡۢۡۧ;

    iput p2, p0, LYue/ۥۡۢۡۦ;->ۥ۟:F

    iput-object p3, p0, LYue/ۥۡۢۡۦ;->ۥ۟۟:[I

    return-void
.end method


# virtual methods
.method public final native onAnimationUpdate(Landroid/animation/ValueAnimator;)V
.end method
