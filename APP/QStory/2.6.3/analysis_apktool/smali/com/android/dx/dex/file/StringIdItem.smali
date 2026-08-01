.class public final Lcom/android/dx/dex/file/StringIdItem;
.super Lcom/android/dx/dex/file/IndexedItem;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/dex/file/IndexedItem;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/file/StringIdItem;",
        ">;"
    }
.end annotation


# instance fields
.field private data:Lcom/android/dx/dex/file/StringDataItem;

.field private final value:Lcom/android/dx/rop/cst/CstString;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstString;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/IndexedItem;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/dex/file/StringIdItem;->data:Lcom/android/dx/dex/file/StringDataItem;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "value == null"

    .line 13
    .line 14
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/StringIdItem;->data:Lcom/android/dx/dex/file/StringDataItem;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getStringData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Lcom/android/dx/dex/file/StringDataItem;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lcom/android/dx/dex/file/StringDataItem;-><init>(Lcom/android/dx/rop/cst/CstString;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/android/dx/dex/file/StringIdItem;->data:Lcom/android/dx/dex/file/StringDataItem;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public compareTo(Lcom/android/dx/dex/file/StringIdItem;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

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
    check-cast p1, Lcom/android/dx/dex/file/StringIdItem;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/StringIdItem;->compareTo(Lcom/android/dx/dex/file/StringIdItem;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/file/StringIdItem;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/dex/file/StringIdItem;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstString;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public getData()Lcom/android/dx/dex/file/StringDataItem;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdItem;->data:Lcom/android/dx/dex/file/StringDataItem;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_STRING_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

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
    iget-object p1, p0, Lcom/android/dx/dex/file/StringIdItem;->data:Lcom/android/dx/dex/file/StringDataItem;

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
    iget-object p0, p0, Lcom/android/dx/dex/file/StringIdItem;->value:Lcom/android/dx/rop/cst/CstString;

    .line 31
    .line 32
    const/16 v1, 0x64

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lcom/android/dx/rop/cst/CstString;->toQuoted(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-interface {p2, v0, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "  string_data_off: "

    .line 52
    .line 53
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x4

    .line 57
    invoke-static {p1, p0, p2, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-interface {p2, p1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
