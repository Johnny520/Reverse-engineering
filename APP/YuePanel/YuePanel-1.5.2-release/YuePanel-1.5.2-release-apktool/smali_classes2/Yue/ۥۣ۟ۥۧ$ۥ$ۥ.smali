.class public final LYue/ۥۣ۟ۥۧ$ۥ$ۥ;
.super LYue/ۥ۠ۢۧ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۥۧ$ۥ;-><init>(LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۟ۥۧ$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۟ۦ;LYue/ۥۣ۟ۥۧ$ۥ;)V
    .locals 0

    iput-object p2, p0, LYue/ۥۣ۟ۥۧ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۥۧ$ۥ;

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ۟;-><init>(LYue/ۥۣۢ۟ۦ;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۥۧ$ۥ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۥۧ$ۥ;->ۥ۟۟ۢۧ()LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->close()V

    invoke-super {p0}, LYue/ۥ۠ۢۧ۟;->close()V

    return-void
.end method
