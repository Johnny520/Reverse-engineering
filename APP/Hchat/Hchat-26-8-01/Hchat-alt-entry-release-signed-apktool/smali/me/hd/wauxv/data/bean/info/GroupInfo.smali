.class public Lme/hd/wauxv/data/bean/info/GroupInfo;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final displayName:Ljava/lang/String;

.field private final memberList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final nickname:Ljava/lang/String;

.field private final owner:Ljava/lang/String;

.field private final rawDisplayNames:Ljava/lang/String;

.field private final remarkName:Ljava/lang/String;

.field private final roomId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->roomId:Ljava/lang/String;

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :cond_1
    iput-object p2, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->name:Ljava/lang/String;

    .line 15
    .line 16
    if-nez p3, :cond_2

    .line 17
    .line 18
    move-object p3, v0

    .line 19
    :cond_2
    iput-object p3, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->nickname:Ljava/lang/String;

    .line 20
    .line 21
    if-nez p4, :cond_3

    .line 22
    .line 23
    move-object p4, v0

    .line 24
    :cond_3
    iput-object p4, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->remarkName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1, p2, p4}, Lme/hd/wauxv/data/bean/info/GroupInfo;->buildDisplayName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->displayName:Ljava/lang/String;

    .line 31
    .line 32
    if-nez p5, :cond_4

    .line 33
    .line 34
    move-object p5, v0

    .line 35
    :cond_4
    iput-object p5, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->owner:Ljava/lang/String;

    .line 36
    .line 37
    if-nez p6, :cond_5

    .line 38
    .line 39
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_5
    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    iput-object p1, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->memberList:Ljava/util/List;

    .line 47
    .line 48
    if-nez p7, :cond_6

    .line 49
    .line 50
    move-object p7, v0

    .line 51
    :cond_6
    iput-object p7, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->rawDisplayNames:Ljava/lang/String;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 8
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

    .line 54
    const-string v4, ""

    move-object v3, p2

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lme/hd/wauxv/data/bean/info/GroupInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method private static buildDisplayName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p2}, Lme/hd/wauxv/data/bean/info/GroupInfo;->isEmpty(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Lme/hd/wauxv/data/bean/info/GroupInfo;->isEmpty(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    return-object p2

    .line 20
    :cond_0
    const-string p0, " ("

    .line 21
    .line 22
    const-string v0, ")"

    .line 23
    .line 24
    invoke-static {p2, p0, p1, v0}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-static {p1}, Lme/hd/wauxv/data/bean/info/GroupInfo;->isEmpty(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    invoke-static {p2}, Lme/hd/wauxv/data/bean/info/GroupInfo;->isEmpty(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    return-object p2

    .line 43
    :cond_3
    return-object p0
.end method

.method private static isEmpty(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method


# virtual methods
.method public getChatroomId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->roomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMemberCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->memberList:Ljava/util/List;

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

.method public getMemberList()Ljava/util/List;
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
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->memberList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNickName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOwner()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->owner:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRawDisplayNames()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->rawDisplayNames:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRemark()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->remarkName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRemarkName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->remarkName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRoomId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->roomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->roomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWxId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->roomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWxid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->roomId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public memberCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->memberList:Ljava/util/List;

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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GroupInfo(roomId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->roomId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", name="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->name:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", remarkName="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->remarkName:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", memberCount="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lme/hd/wauxv/data/bean/info/GroupInfo;->memberList:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ")"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method
