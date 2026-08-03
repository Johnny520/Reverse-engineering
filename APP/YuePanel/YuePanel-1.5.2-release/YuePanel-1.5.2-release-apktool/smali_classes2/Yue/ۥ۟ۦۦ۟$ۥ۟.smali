.class public final LYue/ۥ۟ۦۦ۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;
.implements LYue/ۥ۠ۦۣۣ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۦ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e3$\u06e5;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p2, p0, LYue/ۥ۟ۦۦ۟$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۦ۟$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۦ۟$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    invoke-static {}, LYue/ۥ۟ۦۦ۠;->ۥ۟۟()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method
