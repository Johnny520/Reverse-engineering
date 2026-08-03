.class public final L۟/s7$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/y6;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/s7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/s7;


# direct methods
.method public constructor <init>(L۟/s7;)V
    .locals 0

    iput-object p1, p0, L۟/s7$a;->ۥ:L۟/s7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(FFF)V
    .locals 3

    .line 1
    iget-object v0, p0, L۟/s7$a;->ۥ:L۟/s7;

    .line 2
    .line 3
    invoke-virtual {v0}, L۟/s7;->ۥ۟ۢ()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, L۟/s7$a;->ۥ:L۟/s7;

    .line 8
    .line 9
    iget v2, v1, L۟/s7;->ۥ۟ۡ:F

    .line 10
    .line 11
    cmpg-float v0, v0, v2

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    const/high16 v0, 0x3f800000    # 1.0f

    .line 16
    .line 17
    cmpg-float v0, p1, v0

    .line 18
    .line 19
    if-gez v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, L۟/s7$a;->ۥ:L۟/s7;

    .line 25
    .line 26
    iget-object v0, v0, L۟/s7;->ۥ۠:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, L۟/s7$a;->ۥ:L۟/s7;

    .line 32
    .line 33
    invoke-virtual {p1}, L۟/s7;->ۥ()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method
