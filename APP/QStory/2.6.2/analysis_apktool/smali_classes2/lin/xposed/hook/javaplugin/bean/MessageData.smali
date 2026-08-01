.class public Llin/xposed/hook/javaplugin/bean/MessageData;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public AtList:[Ljava/lang/String;

.field public ChannelID:Ljava/lang/String;

.field public FileName:Ljava/lang/String;

.field public FileSize:J

.field public FileUrl:Ljava/lang/String;

.field public GroupName:Ljava/lang/String;

.field public GroupUin:Ljava/lang/String;

.field public GuildID:Ljava/lang/String;

.field public IsChannel:Z

.field public IsGroup:Z

.field public IsSend:Z

.field public LocalPath:Ljava/lang/String;

.field public MessageContent:Ljava/lang/String;

.field public MessageTime:J

.field public MessageType:I

.field public PeerUin:Ljava/lang/String;

.field public PicList:[Ljava/lang/String;

.field public PicUrlList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public RecordMsg:Llin/xposed/hook/javaplugin/bean/MessageData;

.field public ReplyTo:Ljava/lang/String;

.field public SenderNickName:Ljava/lang/String;

.field public UserUin:Ljava/lang/String;

.field public mAtList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public md5:Ljava/lang/String;

.field public msg:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
