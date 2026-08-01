.class public final Lwj;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# static fields
.field public static final d:Lwj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwj;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwj;->d:Lwj;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-wide v0, Lff;->b:J

    .line 2
    .line 3
    new-instance p0, Lff;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lff;-><init>(J)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method
