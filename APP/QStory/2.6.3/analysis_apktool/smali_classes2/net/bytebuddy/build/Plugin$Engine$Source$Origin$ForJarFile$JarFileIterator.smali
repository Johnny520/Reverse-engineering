.class public Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "JarFileIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
        ">;"
    }
.end annotation


# instance fields
.field private final enumeration:Ljava/util/Enumeration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Enumeration<",
            "Ljava/util/jar/JarEntry;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;Ljava/util/Enumeration;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Enumeration<",
            "Ljava/util/jar/JarEntry;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;->enumeration:Ljava/util/Enumeration;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;->enumeration:Ljava/util/Enumeration;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;->next()Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    move-result-object p0

    return-object p0
.end method

.method public next()Lnet/bytebuddy/build/Plugin$Engine$Source$Element;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Element$ForJarEntry;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;->access$400(Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile;)Ljava/util/jar/JarFile;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator;->enumeration:Ljava/util/Enumeration;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/jar/JarEntry;

    .line 16
    .line 17
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Element$ForJarEntry;-><init>(Ljava/util/jar/JarFile;Ljava/util/jar/JarEntry;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "remove"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
