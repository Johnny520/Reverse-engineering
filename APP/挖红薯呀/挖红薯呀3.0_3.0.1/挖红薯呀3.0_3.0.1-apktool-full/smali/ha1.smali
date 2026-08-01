.class public abstract Lha1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Ls71;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v9, Lla0;

    .line 2
    .line 3
    sget v0, Lia0;->b:F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v9, v0, v1, v1}, Lla0;-><init>(FII)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Ls71;->d:Ls71;

    .line 10
    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    const v10, 0xe7ffff

    .line 14
    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const-wide/16 v5, 0x0

    .line 21
    .line 22
    invoke-static/range {v0 .. v10}, Ls71;->a(Ls71;JLzv;Lz51;JJLla0;I)Ls71;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lha1;->a:Ls71;

    .line 27
    .line 28
    return-void
.end method
