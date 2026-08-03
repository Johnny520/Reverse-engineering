.class public final Lff/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/nio/ByteBuffer;

.field public final d:Ljf/e;


# direct methods
.method public constructor <init>(ILjava/lang/String;[BI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lff/e;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lff/e;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lff/e;->c:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    new-instance p1, Ljf/e;

    .line 15
    .line 16
    new-instance p2, Lac/k;

    .line 17
    .line 18
    invoke-direct {p2, p0, p4}, Lac/k;-><init>(Lff/e;I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljf/e;-><init>(Lac/k;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lff/e;->d:Ljf/e;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lff/e;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
