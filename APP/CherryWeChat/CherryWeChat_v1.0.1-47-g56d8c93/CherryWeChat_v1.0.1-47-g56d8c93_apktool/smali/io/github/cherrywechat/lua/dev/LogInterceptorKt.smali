.class public final Lio/github/cherrywechat/lua/dev/LogInterceptorKt;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final logd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12a76fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a7dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0, p0, p1}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final loge(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    const-wide v0, -0x12a23fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a2afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0, p0, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic loge$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptorKt;->loge(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final logi(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12a05fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a0cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0, p0, p1}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final logv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12a32fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a39fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0, p0, p1}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final logw(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12a14fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a1bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0, p0, p1}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
