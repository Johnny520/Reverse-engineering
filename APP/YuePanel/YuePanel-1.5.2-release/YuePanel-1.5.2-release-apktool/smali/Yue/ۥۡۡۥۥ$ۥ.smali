.class public LYue/ۥۡۡۥۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۡۥۥ;->ۥۣ۟۟۠()Landroid/view/animation/Interpolator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۣ۠۠ۨ;

.field public final synthetic ۥ۟:LYue/ۥۡۡۥۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡۥۥ;LYue/ۥۣ۠۠ۨ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۡۥۥ$ۥ;->ۥ۟:LYue/ۥۡۡۥۥ;

    iput-object p2, p0, LYue/ۥۡۡۥۥ$ۥ;->ۥ:LYue/ۥۣ۠۠ۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 3

    iget-object v0, p0, LYue/ۥۡۡۥۥ$ۥ;->ۥ:LYue/ۥۣ۠۠ۨ;

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, LYue/ۥۣ۠۠ۨ;->ۥ(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method
