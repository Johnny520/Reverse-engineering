.class Lkevin/fun/hook/XhsHook$NoteInfo;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/XhsHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NoteInfo"
.end annotation


# instance fields
.field id:Ljava/lang/String;

.field timestamp:J

.field token:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkevin/fun/hook/XhsHook$NoteInfo;->id:Ljava/lang/String;

    iput-object v0, p0, Lkevin/fun/hook/XhsHook$NoteInfo;->token:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkevin/fun/hook/XhsHook$NoteInfo;->timestamp:J

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$NoteInfo;->id:Ljava/lang/String;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$NoteInfo;->token:Ljava/lang/String;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۦۡ۠ۡ()J

    move-result-wide v0

    iput-wide v0, p0, Lkevin/fun/hook/XhsHook$NoteInfo;->timestamp:J

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "TVzfLv1QyBhAyWutlWtF6w4kpY"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
