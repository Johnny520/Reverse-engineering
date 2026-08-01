.class public final Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation


# instance fields
.field private links:[Ljava/lang/String;

.field private priority:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v2}, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;-><init>([Ljava/lang/String;IILN0/e;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->links:[Ljava/lang/String;

    iput p2, p0, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->priority:I

    return-void
.end method

.method public synthetic constructor <init>([Ljava/lang/String;IILN0/e;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;-><init>([Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final getLinks()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->links:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPriority()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->priority:I

    .line 2
    .line 3
    return v0
.end method

.method public final setLinks([Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->links:[Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPriority(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/ui/JsonMenuManager$AppLink;->priority:I

    .line 2
    .line 3
    return-void
.end method
