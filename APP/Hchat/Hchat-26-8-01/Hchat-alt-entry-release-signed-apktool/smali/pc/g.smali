.class public final Lpc/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lpc/g;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Lpc/g;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p1, p0, Lpc/g;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lpc/g;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lr9/e0;->F(II)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, ", outerCls=null, name="

    .line 9
    .line 10
    const-string v2, ", accessFlags="

    .line 11
    .line 12
    const-string v3, "InnerCls{"

    .line 13
    .line 14
    iget-object v4, p0, Lpc/g;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v5, p0, Lpc/g;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v3, v4, v1, v5, v2}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "}"

    .line 23
    .line 24
    invoke-static {v1, v0, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method
