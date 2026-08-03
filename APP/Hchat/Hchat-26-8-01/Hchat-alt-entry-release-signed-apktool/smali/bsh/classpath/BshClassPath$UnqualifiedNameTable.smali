.class Lbsh/classpath/BshClassPath$UnqualifiedNameTable;
.super Ljava/util/HashMap;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/classpath/BshClassPath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UnqualifiedNameTable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Lbsh/classpath/BshClassPath$AmbiguousName;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lbsh/classpath/BshClassPath;->splitClassname(Ljava/lang/String;)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    invoke-super {p0, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lbsh/classpath/BshClassPath$AmbiguousName;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lbsh/classpath/BshClassPath$AmbiguousName;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-super {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-super {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lbsh/classpath/BshClassPath$AmbiguousName;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassPath$AmbiguousName;->add(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
