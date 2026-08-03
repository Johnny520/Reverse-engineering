.class Lorg/simpleframework/xml/stream/StreamReader$Start;
.super Lorg/simpleframework/xml/stream/EventElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/simpleframework/xml/stream/StreamReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Start"
.end annotation


# instance fields
.field private final element:LYue/ۥۢ۟ۨۤ;

.field private final location:LYue/ۥ۠ۧۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥۢۦ۠ۨ;)V
    .locals 1

    invoke-direct {p0}, Lorg/simpleframework/xml/stream/EventElement;-><init>()V

    invoke-interface {p1}, LYue/ۥۢۦ۠ۨ;->ۥۣ۟۟ۦ()LYue/ۥۢ۟ۨۤ;

    move-result-object v0

    iput-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:LYue/ۥۢ۟ۨۤ;

    invoke-interface {p1}, LYue/ۥۢۦ۠ۨ;->ۥ۟۟۠۟()LYue/ۥ۠ۧۧۧ;

    move-result-object p1

    iput-object p1, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->location:LYue/ۥ۠ۧۧۧ;

    return-void
.end method


# virtual methods
.method public getAttributes()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06df\u06e2\u06e0\u06e1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:LYue/ۥۢ۟ۨۤ;

    invoke-interface {v0}, LYue/ۥۢ۟ۨۤ;->getAttributes()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public getLine()I
    .locals 1

    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->location:LYue/ۥ۠ۧۧۧ;

    invoke-interface {v0}, LYue/ۥ۠ۧۧۧ;->ۥۣ۟۟۟()I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:LYue/ۥۢ۟ۨۤ;

    invoke-interface {v0}, LYue/ۥۢ۟ۨۤ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:LYue/ۥۢ۟ۨۤ;

    invoke-interface {v0}, LYue/ۥۢ۟ۨۤ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReference()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:LYue/ۥۢ۟ۨۤ;

    invoke-interface {v0}, LYue/ۥۢ۟ۨۤ;->getName()LYue/ۥۡۥۤۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۥۤۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader$Start;->element:LYue/ۥۢ۟ۨۤ;

    return-object v0
.end method
