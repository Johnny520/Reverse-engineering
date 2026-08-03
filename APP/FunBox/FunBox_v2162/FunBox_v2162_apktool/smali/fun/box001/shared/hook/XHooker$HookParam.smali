.class public abstract Lfun/box001/shared/hook/XHooker$HookParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfun/box001/shared/hook/XHooker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "HookParam"
.end annotation


# instance fields
.field public args:[Ljava/lang/Object;

.field public method:Ljava/lang/reflect/Member;

.field public obj:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getResult()Ljava/lang/Object;
.end method

.method public abstract getThrowable()Ljava/lang/Throwable;
.end method

.method public abstract setResult(Ljava/lang/Object;)V
.end method

.method public abstract setThrowable(Ljava/lang/Throwable;)V
.end method

.method public abstract unhook()V
.end method
