.class public final Lwn0;
.super Lu50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lu5;


# direct methods
.method public constructor <init>(Lyw;Lsw;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu5;

    .line 5
    .line 6
    invoke-direct {v0}, Lu5;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lrn0;

    .line 10
    .line 11
    invoke-direct {v1, p2, p1}, Lrn0;-><init>(Lsw;Lyw;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p3, v1}, Lu5;->a(ILh70;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lwn0;->a:Lu5;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final l()Lu5;
    .locals 0

    .line 1
    iget-object p0, p0, Lwn0;->a:Lu5;

    .line 2
    .line 3
    return-object p0
.end method
