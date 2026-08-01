.class public final Lld0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lg30;


# instance fields
.field public final a:J

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ld;


# direct methods
.method public constructor <init>(Lxg0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lld0;->a:J

    .line 5
    .line 6
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lld0;->b:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    iget-object p1, p1, Lxg0;->a:Lf11;

    .line 14
    .line 15
    new-instance p2, Ld;

    .line 16
    .line 17
    const/16 p3, 0x9

    .line 18
    .line 19
    invoke-direct {p2, p3, p1, p0}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lld0;->c:Ld;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()Lhu;
    .locals 0

    .line 1
    iget-object p0, p0, Lld0;->c:Ld;

    .line 2
    .line 3
    return-object p0
.end method
