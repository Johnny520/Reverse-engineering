.class public final synthetic Lpx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FileFilter;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpx;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;)Z
    .locals 1

    iget v0, p0, Lpx;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->a(Ljava/io/File;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1}, Lio/github/cherrywechat/lua/loader/ScriptLoader;->a(Ljava/io/File;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
