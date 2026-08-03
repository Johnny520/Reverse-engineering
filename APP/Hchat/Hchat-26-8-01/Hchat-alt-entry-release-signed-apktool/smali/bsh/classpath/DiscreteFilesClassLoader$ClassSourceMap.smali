.class public Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;
.super Ljava/util/HashMap;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/classpath/DiscreteFilesClassLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ClassSourceMap"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Lbsh/classpath/BshClassPath$ClassSource;",
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
.method public get(Ljava/lang/Object;)Lbsh/classpath/BshClassPath$ClassSource;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lbsh/classpath/BshClassPath$ClassSource;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;->get(Ljava/lang/Object;)Lbsh/classpath/BshClassPath$ClassSource;

    move-result-object p1

    return-object p1
.end method

.method public put(Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)Lbsh/classpath/BshClassPath$ClassSource;
    .locals 0

    .line 10
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbsh/classpath/BshClassPath$ClassSource;

    return-object p1
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Lbsh/classpath/BshClassPath$ClassSource;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;->put(Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)Lbsh/classpath/BshClassPath$ClassSource;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
