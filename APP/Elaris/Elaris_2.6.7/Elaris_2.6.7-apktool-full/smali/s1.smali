.class public final synthetic Ls1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Ls1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ls1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ls1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Ls1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ls1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ls1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lio/github/libxposed/service/RemotePreferences$Editor;

    .line 11
    .line 12
    check-cast v1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-static {p0, v1}, Lio/github/libxposed/service/RemotePreferences$Editor;->a(Lio/github/libxposed/service/RemotePreferences$Editor;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p0, Le2;

    .line 19
    .line 20
    check-cast v1, Ll1;

    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Le2;->b:Landroid/app/Activity;

    .line 23
    .line 24
    iget-object v1, v1, Ll1;->a:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v2, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v3, "id"

    .line 32
    .line 33
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string v1, "POST"

    .line 37
    .line 38
    const-string v3, "https://1327845120-5m4s7nykmv.ap-guangzhou.tencentscf.com/api/stickers/report"

    .line 39
    .line 40
    invoke-static {v0}, Li5;->a2(Landroid/content/Context;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v1, v3, v2, v0}, Li5;->y1(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    const-string v0, "\u5df2\u63d0\u4ea4\u4e3e\u62a5"

    .line 48
    .line 49
    invoke-static {p0, v0}, Lg2;->m(Le2;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    invoke-static {v0}, Lg2;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {p0, v0}, Lg2;->m(Le2;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
