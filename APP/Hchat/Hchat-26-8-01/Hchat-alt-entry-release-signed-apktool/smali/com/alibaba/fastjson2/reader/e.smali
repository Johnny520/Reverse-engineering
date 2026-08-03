.class public final synthetic Lcom/alibaba/fastjson2/reader/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->a(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
