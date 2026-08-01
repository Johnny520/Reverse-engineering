.class public abstract Lj30;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lcz;

.field public static final b:Lac1;

.field public static final c:Lg41;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcz;

    .line 2
    .line 3
    sget-object v1, Li30;->d:Li30;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo2;-><init>(Lww;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lj30;->a:Lcz;

    .line 9
    .line 10
    new-instance v0, Lac1;

    .line 11
    .line 12
    sget-object v1, Lh30;->d:Lh30;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lo2;-><init>(Lww;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lj30;->b:Lac1;

    .line 18
    .line 19
    new-instance v0, La00;

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    invoke-direct {v0, v1}, La00;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lz60;->J(Lhw;)Lx51;

    .line 27
    .line 28
    .line 29
    new-instance v0, La00;

    .line 30
    .line 31
    const/16 v1, 0x9

    .line 32
    .line 33
    invoke-direct {v0, v1}, La00;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lg41;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lat0;-><init>(Lhw;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lj30;->c:Lg41;

    .line 42
    .line 43
    return-void
.end method
