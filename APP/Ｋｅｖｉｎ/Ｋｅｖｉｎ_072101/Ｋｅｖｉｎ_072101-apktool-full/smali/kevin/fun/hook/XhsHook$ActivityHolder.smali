.class public Lkevin/fun/hook/XhsHook$ActivityHolder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/XhsHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ActivityHolder"
.end annotation


# static fields
.field public static volatile currentActivity:Landroid/app/Activity;


# instance fields
.field final this$0:Lkevin/fun/hook/XhsHook;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkevin/fun/hook/XhsHook;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$ActivityHolder;->this$0:Lkevin/fun/hook/XhsHook;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "VaRlrOLjm8snZ967w"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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
