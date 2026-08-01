package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.minlog.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class InputChunked extends Input {
    private int chunkSize;

    public InputChunked() {
        this.chunkSize = -1;
    }

    private boolean readChunkSize() {
        try {
            InputStream inputStream = getInputStream();
            int i = 0;
            for (int i2 = 0; i2 < 32; i2 += 7) {
                int i3 = inputStream.read();
                if (i3 == -1) {
                    return false;
                }
                i |= (i3 & 127) << i2;
                if ((i3 & 128) == 0) {
                    this.chunkSize = i;
                    if (!Log.TRACE || i <= 0) {
                        return true;
                    }
                    Log.trace("kryo", "Read chunk: " + this.chunkSize);
                    return true;
                }
            }
            throw new KryoException("Unable to read chunk size: malformed integer");
        } catch (IOException e) {
            throw new KryoException("Unable to read chunk size.", e);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int fill(byte[] bArr, int i, int i2) {
        int i3 = this.chunkSize;
        if (i3 == -1) {
            if (!readChunkSize()) {
                return -1;
            }
        } else if (i3 == 0) {
            return -1;
        }
        int iFill = super.fill(bArr, i, Math.min(this.chunkSize, i2));
        int i4 = this.chunkSize - iFill;
        this.chunkSize = i4;
        if (i4 != 0 || readChunkSize()) {
            return iFill;
        }
        return -1;
    }

    public void nextChunk() {
        this.position = this.limit;
        if (this.chunkSize == -1) {
            readChunkSize();
        }
        while (true) {
            int i = this.chunkSize;
            if (i <= 0) {
                break;
            } else {
                skip(i);
            }
        }
        this.chunkSize = -1;
        if (Log.TRACE) {
            Log.trace("kryo", "Next chunk.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        super.reset();
        this.chunkSize = -1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setBuffer(byte[] bArr, int i, int i2) {
        super.setBuffer(bArr, i, i2);
        this.chunkSize = -1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setInputStream(InputStream inputStream) {
        super.setInputStream(inputStream);
        this.chunkSize = -1;
    }

    public InputChunked(int i) {
        super(i);
        this.chunkSize = -1;
    }

    public InputChunked(InputStream inputStream) {
        super(inputStream);
        this.chunkSize = -1;
    }

    public InputChunked(InputStream inputStream, int i) {
        super(inputStream, i);
        this.chunkSize = -1;
    }
}
