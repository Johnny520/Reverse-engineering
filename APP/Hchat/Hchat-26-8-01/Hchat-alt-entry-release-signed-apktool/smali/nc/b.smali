.class public final Lnc/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnc/b;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lnc/b;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, Lnc/b;->a:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq v1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq v1, v0, :cond_0

    .line 11
    .line 12
    const-string v0, "null"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "SYSTEM"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const-string v0, "RUNTIME"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    const-string v0, "BUILD"

    .line 22
    .line 23
    :goto_0
    iget-object v1, p0, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, ", type="

    .line 30
    .line 31
    const-string v3, ", values="

    .line 32
    .line 33
    const-string v4, "Annotation{"

    .line 34
    .line 35
    iget-object v5, p0, Lnc/b;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v4, v0, v2, v5, v3}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "}"

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method
