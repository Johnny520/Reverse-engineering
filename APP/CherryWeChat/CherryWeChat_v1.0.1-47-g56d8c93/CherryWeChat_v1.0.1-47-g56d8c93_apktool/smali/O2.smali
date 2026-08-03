.class public final synthetic LO2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$DurationScaleChangeListener;


# instance fields
.field public final synthetic a:LP3;


# direct methods
.method public synthetic constructor <init>(LP3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO2;->a:LP3;

    return-void
.end method


# virtual methods
.method public final onChanged(F)V
    .locals 1

    iget-object v0, p0, LO2;->a:LP3;

    iget-object v0, v0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LQ2;

    iput p1, v0, LQ2;->g:F

    return-void
.end method
