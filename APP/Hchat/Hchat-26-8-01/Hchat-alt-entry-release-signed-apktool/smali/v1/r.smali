.class public final Lv1/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/o0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lfg/l;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lv1/r;->a:I

    .line 5
    .line 6
    iput p2, p0, Lv1/r;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lv1/r;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lv1/r;->d:Lfg/l;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/r;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lv1/r;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lv1/r;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Lfg/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/r;->d:Lfg/l;

    .line 2
    .line 3
    return-object v0
.end method
