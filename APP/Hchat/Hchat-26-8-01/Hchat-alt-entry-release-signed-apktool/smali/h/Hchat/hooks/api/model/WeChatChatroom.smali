.class public final Lh/Hchat/hooks/api/model/WeChatChatroom;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field public final chatroomId:Ljava/lang/String;

.field public final memberIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final name:Ljava/lang/String;

.field public final owner:Ljava/lang/String;

.field public final rawDisplayNames:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    :cond_0
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :cond_1
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->name:Ljava/lang/String;

    .line 15
    .line 16
    if-nez p3, :cond_2

    .line 17
    .line 18
    move-object p3, v0

    .line 19
    :cond_2
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->owner:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p4, :cond_3

    .line 22
    .line 23
    invoke-static {p4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_0

    .line 28
    :cond_3
    const/4 p1, 0x0

    .line 29
    :goto_0
    if-nez p1, :cond_4

    .line 30
    .line 31
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 32
    .line 33
    :cond_4
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 34
    .line 35
    if-nez p5, :cond_5

    .line 36
    .line 37
    move-object p5, v0

    .line 38
    :cond_5
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->rawDisplayNames:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final getChatroomId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMemberCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final getMemberList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOwner()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->owner:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRawDisplayNames()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->rawDisplayNames:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRoomId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final memberCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
