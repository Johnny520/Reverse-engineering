.class public abstract Lfun/box001/shared/hook/XHooker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfun/box001/shared/hook/XHooker$HookCallback;,
        Lfun/box001/shared/hook/XHooker$HookParam;
    }
.end annotation


# static fields
.field private static instance:Lfun/box001/shared/hook/XHooker;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decompile(Ljava/lang/reflect/Member;)V
    .locals 1

    sget-object v0, Lfun/box001/shared/hook/XHooker;->instance:Lfun/box001/shared/hook/XHooker;

    invoke-virtual {v0, p0}, Lfun/box001/shared/hook/XHooker;->decompile0(Ljava/lang/reflect/Member;)V

    return-void
.end method

.method public static hookAfter(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V
    .locals 1

    sget-object v0, Lfun/box001/shared/hook/XHooker;->instance:Lfun/box001/shared/hook/XHooker;

    invoke-virtual {v0, p0, p1}, Lfun/box001/shared/hook/XHooker;->hookAfterImpl(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V

    return-void
.end method

.method public static hookBefore(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V
    .locals 1

    sget-object v0, Lfun/box001/shared/hook/XHooker;->instance:Lfun/box001/shared/hook/XHooker;

    invoke-virtual {v0, p0, p1}, Lfun/box001/shared/hook/XHooker;->hookBeforeImpl(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V

    return-void
.end method

.method public static invoke(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lfun/box001/shared/hook/XHooker;->instance:Lfun/box001/shared/hook/XHooker;

    invoke-virtual {v0, p0, p1, p2}, Lfun/box001/shared/hook/XHooker;->invokeImpl(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static log(Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lfun/box001/shared/hook/XHooker;->instance:Lfun/box001/shared/hook/XHooker;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lfun/box001/shared/hook/XHooker;->logImpl(Ljava/lang/String;)V

    return-void
.end method

.method public static setImpl(Lfun/box001/shared/hook/XHooker;)V
    .locals 0

    sput-object p0, Lfun/box001/shared/hook/XHooker;->instance:Lfun/box001/shared/hook/XHooker;

    return-void
.end method


# virtual methods
.method protected abstract decompile0(Ljava/lang/reflect/Member;)V
.end method

.method protected abstract hookAfterImpl(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V
.end method

.method protected abstract hookBeforeImpl(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V
.end method

.method protected abstract invokeImpl(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract logImpl(Ljava/lang/String;)V
.end method
