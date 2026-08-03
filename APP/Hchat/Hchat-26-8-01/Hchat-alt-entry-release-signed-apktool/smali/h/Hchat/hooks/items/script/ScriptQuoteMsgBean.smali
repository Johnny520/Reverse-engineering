.class public final Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I

.field public static final Companion:Leb/f0;


# instance fields
.field private final content:Ljava/lang/String;

.field private final createTime:J

.field private final displayName:Ljava/lang/String;

.field private final msgSource:Ljava/lang/String;

.field private final sendTalker:Ljava/lang/String;

.field private final strId:Ljava/lang/String;

.field private final svrId:J

.field private final talker:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Leb/f0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->Companion:Leb/f0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->title:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->msgSource:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->sendTalker:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->displayName:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->talker:Ljava/lang/String;

    .line 13
    .line 14
    iput p6, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->type:I

    .line 15
    .line 16
    iput-object p7, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->content:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p8, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->svrId:J

    .line 19
    .line 20
    iput-object p10, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->strId:Ljava/lang/String;

    .line 21
    .line 22
    iput-wide p11, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->createTime:J

    .line 23
    .line 24
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;JLgg/g;)V
    .locals 0

    .line 25
    invoke-direct/range {p0 .. p12}, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;J)V

    return-void
.end method


# virtual methods
.method public final getContent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMsgSource()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->msgSource:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSendTalker()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->sendTalker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSenderId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->sendTalker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStrId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->strId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSvrId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->svrId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTalker()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->talker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTalkerId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->talker:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/items/script/ScriptQuoteMsgBean;->type:I

    .line 2
    .line 3
    return v0
.end method
