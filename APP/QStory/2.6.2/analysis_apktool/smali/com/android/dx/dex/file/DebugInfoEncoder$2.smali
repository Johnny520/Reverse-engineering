.class Lcom/android/dx/dex/file/DebugInfoEncoder$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/dex/file/DebugInfoEncoder;->extractMethodArguments()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/android/dx/dex/code/LocalList$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/dex/file/DebugInfoEncoder;


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/file/DebugInfoEncoder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/dex/file/DebugInfoEncoder$2;->this$0:Lcom/android/dx/dex/file/DebugInfoEncoder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public compare(Lcom/android/dx/dex/code/LocalList$Entry;Lcom/android/dx/dex/code/LocalList$Entry;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p2}, Lcom/android/dx/dex/code/LocalList$Entry;->getRegister()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sub-int/2addr p0, p1

    .line 10
    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 11
    check-cast p1, Lcom/android/dx/dex/code/LocalList$Entry;

    check-cast p2, Lcom/android/dx/dex/code/LocalList$Entry;

    invoke-virtual {p0, p1, p2}, Lcom/android/dx/dex/file/DebugInfoEncoder$2;->compare(Lcom/android/dx/dex/code/LocalList$Entry;Lcom/android/dx/dex/code/LocalList$Entry;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method
