.class public final LYue/ۥۡۦۢۥ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۢۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:C


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-char v0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟;->ۥۣ۟۟۠:C

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
