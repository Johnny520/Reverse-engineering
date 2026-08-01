.class public final synthetic Lh82;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lh82;->ε:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lh82;->ε:J

    .line 2
    .line 3
    sget-wide v2, Ll82;->θ:J

    .line 4
    .line 5
    cmp-long p0, v2, v0

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, Ll82;->α:Ll82;

    .line 11
    .line 12
    invoke-static {}, Ll82;->ε()Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    .line 23
    .line 24
    cmpg-float v0, p0, v0

    .line 25
    .line 26
    if-gtz v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p0}, Ll82;->α(F)Z

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_0
    return-void
.end method
