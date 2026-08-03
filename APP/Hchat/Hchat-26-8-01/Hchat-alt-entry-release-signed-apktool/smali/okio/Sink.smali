.class public interface abstract Lokio/Sink;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# virtual methods
.method public abstract close()V
.end method

.method public abstract flush()V
.end method

.method public abstract timeout()Lokio/Timeout;
.end method

.method public abstract write(Lokio/Buffer;J)V
.end method
