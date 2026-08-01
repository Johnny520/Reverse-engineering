.class public final Lcom/android/dx/dex/file/CallSiteIdItem;
.super Lcom/android/dx/dex/file/IndexedItem;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/dex/file/IndexedItem;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/file/CallSiteIdItem;",
        ">;"
    }
.end annotation


# static fields
.field private static final ITEM_SIZE:I = 0x4


# instance fields
.field data:Lcom/android/dx/dex/file/CallSiteItem;

.field final invokeDynamicRef:Lcom/android/dx/rop/cst/CstCallSiteRef;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstCallSiteRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/IndexedItem;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/dex/file/CallSiteIdItem;->invokeDynamicRef:Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/android/dx/dex/file/CallSiteIdItem;->data:Lcom/android/dx/dex/file/CallSiteItem;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/CallSiteIdItem;->invokeDynamicRef:Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstCallSiteRef;->getCallSite()Lcom/android/dx/rop/cst/CstCallSite;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getCallSiteIds()Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Lcom/android/dx/dex/file/CallSiteIdsSection;->getCallSiteItem(Lcom/android/dx/rop/cst/CstCallSite;)Lcom/android/dx/dex/file/CallSiteItem;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getByteData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v2, Lcom/android/dx/dex/file/CallSiteItem;

    .line 22
    .line 23
    invoke-direct {v2, v0}, Lcom/android/dx/dex/file/CallSiteItem;-><init>(Lcom/android/dx/rop/cst/CstCallSite;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lcom/android/dx/dex/file/CallSiteIdsSection;->addCallSiteItem(Lcom/android/dx/rop/cst/CstCallSite;Lcom/android/dx/dex/file/CallSiteItem;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iput-object v2, p0, Lcom/android/dx/dex/file/CallSiteIdItem;->data:Lcom/android/dx/dex/file/CallSiteItem;

    .line 33
    .line 34
    return-void
.end method

.method public compareTo(Lcom/android/dx/dex/file/CallSiteIdItem;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/CallSiteIdItem;->invokeDynamicRef:Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/android/dx/dex/file/CallSiteIdItem;->invokeDynamicRef:Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/android/dx/dex/file/CallSiteIdItem;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/CallSiteIdItem;->compareTo(Lcom/android/dx/dex/file/CallSiteIdItem;)I

    move-result p0

    return p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_CALL_SITE_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public writeSize()I
    .locals 0

    .line 1
    const/4 p0, 0x4

    .line 2
    return p0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/android/dx/dex/file/CallSiteIdItem;->data:Lcom/android/dx/dex/file/CallSiteItem;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/android/dx/dex/file/IndexedItem;->indexString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/android/dx/dex/file/CallSiteIdItem;->invokeDynamicRef:Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstCallSiteRef;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-interface {p2, v0, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, "call_site_off: "

    .line 50
    .line 51
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x4

    .line 55
    invoke-static {p1, p0, p2, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 56
    .line 57
    .line 58
    :cond_0
    invoke-interface {p2, p1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
