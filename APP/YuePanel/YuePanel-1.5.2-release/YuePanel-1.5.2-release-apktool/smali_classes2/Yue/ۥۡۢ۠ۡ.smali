.class public abstract LYue/ۥۡۢ۠ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۨۡۥ;
.implements Ljava/io/Serializable;


# static fields
.field public static final ۥ۟۟۠ۤ:J = 0x68929dc81c4e557dL


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۢ۠ۡ;->ۥۣ۟۟۠:Ljava/lang/String;

    return-object v0
.end method

.method public ۥۣۣ۟۟()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۢ۠ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۡۦ;->ۥ۟۟۟ۤ(Ljava/lang/String;)LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    return-object v0
.end method
