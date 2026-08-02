.class public abstract Lr63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lm13;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v12, Lya1;

    .line 2
    .line 3
    sget v0, Lva1;->b:F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v12, v0, v1, v1}, Lya1;-><init>(FII)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lm13;->d:Lm13;

    .line 10
    .line 11
    sget-object v11, Lb60;->a:Lw02;

    .line 12
    .line 13
    const v13, 0xe7ffff

    .line 14
    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const-wide/16 v7, 0x0

    .line 23
    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    invoke-static/range {v0 .. v13}, Lm13;->a(Lm13;JJLim0;Lmx2;JJLw02;Lya1;I)Lm13;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lr63;->a:Lm13;

    .line 31
    .line 32
    return-void
.end method
