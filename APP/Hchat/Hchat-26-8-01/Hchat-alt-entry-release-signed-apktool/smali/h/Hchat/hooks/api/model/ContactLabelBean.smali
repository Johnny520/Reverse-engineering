.class public final Lh/Hchat/hooks/api/model/ContactLabelBean;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field public final labelId:Ljava/lang/String;

.field public final labelName:Ljava/lang/String;

.field public final userNameList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
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
    iput-object p1, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :cond_1
    iput-object p2, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    invoke-static {p3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-nez p1, :cond_3

    .line 25
    .line 26
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 27
    .line 28
    :cond_3
    iput-object p1, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final getContactList()Ljava/util/List;
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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLabelId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLabelName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserNameList()Ljava/util/List;
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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUsernameList()Ljava/util/List;
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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 6
    .line 7
    const-string v3, ", labelName="

    .line 8
    .line 9
    const-string v4, ", userNameList="

    .line 10
    .line 11
    const-string v5, "ContactLabelBean(labelId="

    .line 12
    .line 13
    invoke-static {v5, v0, v3, v1, v4}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ")"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
