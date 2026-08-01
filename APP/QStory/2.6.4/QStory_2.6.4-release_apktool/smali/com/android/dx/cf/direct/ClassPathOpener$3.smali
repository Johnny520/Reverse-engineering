.class Lcom/android/dx/cf/direct/ClassPathOpener$3;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/cf/direct/ClassPathOpener;->processArchive(Ljava/io/File;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Ljava/util/zip/ZipEntry;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/cf/direct/ClassPathOpener;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/direct/ClassPathOpener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/direct/ClassPathOpener$3;->this$0:Lcom/android/dx/cf/direct/ClassPathOpener;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 14
    check-cast p1, Ljava/util/zip/ZipEntry;

    check-cast p2, Ljava/util/zip/ZipEntry;

    invoke-virtual {p0, p1, p2}, Lcom/android/dx/cf/direct/ClassPathOpener$3;->compare(Ljava/util/zip/ZipEntry;Ljava/util/zip/ZipEntry;)I

    move-result p0

    return p0
.end method

.method public compare(Ljava/util/zip/ZipEntry;Ljava/util/zip/ZipEntry;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, Lcom/android/dx/cf/direct/ClassPathOpener;->access$000(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
