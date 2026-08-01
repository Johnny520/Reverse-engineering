.class public final Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation


# instance fields
.field private appLink:Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;

.field private groupId:I

.field private itemId:I

.field private link:Ljava/lang/String;

.field private order:I

.field private since:I

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;-><init>(IIILjava/lang/String;Ljava/lang/String;Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;IILN0/e;)V

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->groupId:I

    .line 4
    iput p2, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->itemId:I

    .line 5
    iput p3, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->order:I

    .line 6
    iput-object p4, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->title:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->link:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->appLink:Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;

    .line 9
    iput p7, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->since:I

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;IILN0/e;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    .line 10
    const-string v1, ""

    if-eqz p9, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    const/4 p6, 0x0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;-><init>(IIILjava/lang/String;Ljava/lang/String;Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;I)V

    return-void
.end method


# virtual methods
.method public final getAppLink()Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->appLink:Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->groupId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getItemId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->itemId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLink()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->link:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOrder()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->order:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSince()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->since:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setAppLink(Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->appLink:Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;

    .line 2
    .line 3
    return-void
.end method

.method public final setGroupId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->groupId:I

    .line 2
    .line 3
    return-void
.end method

.method public final setItemId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->itemId:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLink(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->link:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setOrder(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->order:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSince(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->since:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
