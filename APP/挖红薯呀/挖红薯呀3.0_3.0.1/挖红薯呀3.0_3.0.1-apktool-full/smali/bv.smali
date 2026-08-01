.class public final Lbv;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final b:Lbv;

.field public static final c:Lbv;

.field public static final d:Lbv;


# instance fields
.field public final a:Lsh0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbv;

    .line 2
    .line 3
    invoke-direct {v0}, Lbv;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbv;->b:Lbv;

    .line 7
    .line 8
    new-instance v0, Lbv;

    .line 9
    .line 10
    invoke-direct {v0}, Lbv;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lbv;->c:Lbv;

    .line 14
    .line 15
    new-instance v0, Lbv;

    .line 16
    .line 17
    invoke-direct {v0}, Lbv;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lbv;->d:Lbv;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsh0;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lu9;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lbv;->a:Lsh0;

    .line 14
    .line 15
    return-void
.end method
